package com.nyl.nylim.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.GetItemRequest;
import com.nyl.nylim.domain.Price;

@Service
public class PriceService {
	
	private String endPoint = "http://localhost:8000";
	private String reigon = "us-east-1";
	

	private String tableName = "nylim-nonprod-dev-fund-prices";
	
	
	private String partitionKey = "effectiveDate";
	private String partitionKeyValue = "2018-01-01";
	
	private String cusip = "cusip";
	private String fundID = "fundId";
	private String ticker = "ticker";
	private String frequency = "frequency";
	private String effectiveDate = "effectiveDate";
	
	private String value = "c1";

	public List<Price> getPrices() {

		HashMap<String, AttributeValue> key_to_get = new HashMap<String, AttributeValue>();

		key_to_get.put(partitionKey, new AttributeValue(partitionKeyValue));
		key_to_get.put(cusip, new AttributeValue(value));

		GetItemRequest request = new GetItemRequest().withKey(key_to_get).withTableName(tableName);
		final AmazonDynamoDB ddb = AmazonDynamoDBClientBuilder.standard().withEndpointConfiguration(new EndpointConfiguration(endPoint, reigon)).build();

		try {
			
			Map<String, AttributeValue> returned_item = ddb.getItem(request).getItem();
			if (returned_item != null) {
				
				List<Price> prices = new ArrayList<Price>();
				
				prices.add(new Price(returned_item.get(fundID).getS(), returned_item.get(cusip).getS(), returned_item.get(ticker).getS(), returned_item.get(effectiveDate).getS(), returned_item.get(frequency).getS()));
					
				return prices;

			} else {
				System.out.format("No item found with the key %s!\n", value);
				return new ArrayList<Price>();
			}
		}
		catch(AmazonServiceException e){
			System.err.println(e.getErrorMessage());
			return new ArrayList<Price>(); 
		}
	}

}
