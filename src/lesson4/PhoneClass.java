package lesson4;

import java.util.HashMap;

public class PhoneClass {
    private HashMap<String,String> stringStringHashMap = new HashMap<>();

    public void add(String phone, String name){
        stringStringHashMap.put(phone,name);
    }

    public String getPhoneByFIO(String name){
        if(stringStringHashMap.containsValue(name)){
            String result = "Телефон: ";
            for(String key: stringStringHashMap.keySet()){
                if(stringStringHashMap.get(key).equals(name)) result += key + "; ";
            }
            return result;
        } else return "Не найдено";

    }



}
