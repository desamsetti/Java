package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class numUniqueMails {

    public int numUniqueEmails(String[] emails) {
        String emailVal = "";
        Set<String> s1 = new HashSet<String>();
        for(int i=0;i<emails.length;i++)
        {
            emailVal = emails[i];
            String emailSplitArray[]= emailVal.split("@");
            String localName = emailSplitArray[0];
            String domainName = emailSplitArray[1];

            localName = localName.replace(".","");
            String plusSignLocalName[] = localName.split("\\+");
            String finalLocalName = plusSignLocalName[0];

            String finalEmailVal = finalLocalName +"@"+domainName;
            s1.add(finalEmailVal);
        }


        Iterator iter = s1.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        return s1.size();
    }
}
