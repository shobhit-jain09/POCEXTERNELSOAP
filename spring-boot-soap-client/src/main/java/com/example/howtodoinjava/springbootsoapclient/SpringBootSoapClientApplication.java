package com.example.howtodoinjava.springbootsoapclient;


import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.bind.JAXBElement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.howtodoinjava.schemas.school.GetMCMPStatus;
import com.example.howtodoinjava.schemas.school.GetMCMPStatusResponse;

@SpringBootApplication
public class SpringBootSoapClientApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapClientApplication.class, args);
	}
	
	@Bean
	CommandLineRunner lookup(SOAPConnector soapConnector) {
		try {
		return args -> {
			TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager(){
			    public X509Certificate[] getAcceptedIssuers(){return null;}
			    public void checkClientTrusted(X509Certificate[] certs, String authType){}
			    public void checkServerTrusted(X509Certificate[] certs, String authType){}
			}};

			// Install the all-trusting trust manager
			try {
			    SSLContext sc = SSLContext.getInstance("TLS");
			    sc.init(null, trustAllCerts, new SecureRandom());
			    HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
			} catch (Exception e) {
			    ;
			}
			
			Map<String, List<String>> requestHeaders = new HashMap<>();
		       requestHeaders.put("Authorization",Arrays.asList("Basic bWRpbnRlcmZhY2U6c2NhcnBh"));
			GetMCMPStatus request = new GetMCMPStatus();
			request.setMcmpIds("MCMP028092");
			
			Object response =soapConnector.callWebService("https://synapstest.bayer.biz:443/Agile/extension/ProcessedMCMPService", request);
			JAXBElement<GetMCMPStatusResponse> res=(JAXBElement<GetMCMPStatusResponse>) response;
			soapConnector.callWebService("https://synapstest.bayer.biz:443/Agile/extension/ProcessedMCMPService", request);
			System.out.println("Got Response As below ========= : ");
			System.out.println("Name : "+res.getValue().getSynapseMessage().getControlArea().getSource());
			
			
		
		};
		
		}catch(Exception e)
		{
			return null;
		}
	}
}
