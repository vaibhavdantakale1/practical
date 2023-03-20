class Nestedif {
public static void main(String[] args) {
String address ="Kolkata,India";

if(address.endsWith("India")) {

if(address.contains("Dehli")) {
System.out.println("Your city is Dehli");
}

else if(address.cointains("Mumbai")) {
System.out.println("Your city is Mumbai");
}

else {
System.out.println(address.split(",")[0]);
}
}
else {
System.out.println("you are not living in India");
}
}
}