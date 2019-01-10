package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public int numUniqueEmails(String[] emails) {
        String emailVal = "";
        Set<String> s1 = new HashSet<String>();
        for(int i=0;i<emails.length;i++)
        {
            emailVal = emails[i];
            String emailSplitArray[]= emailVal.split("@");
            String localName = emailSplitArray[0];
            String domainName = emailSplitArray[1];

            localName.replace('.',' ');
            String plusSignLocalName[] = localName.split("\\+");
            String finalLocalName = plusSignLocalName[0];

            String finalEmailVal = finalLocalName +"@"+domainName;
            s1.add(finalEmailVal);
        }

        return s1.size();
    }

    public static void main(String[] args) {
	// write your code here


        List<String> l1 = new ArrayList<String>();

        String l2[] = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        l1.add("test.email+alex@leetcode.com");
        l1.add("test.e.mail+bob.cathy@leetcode.com");
        l1.add("testemail+david@lee.tcode.com");

        numUniqueMails n1 = new numUniqueMails();
        System.out.println("The size is "+n1.numUniqueEmails(l2));
    }



}
