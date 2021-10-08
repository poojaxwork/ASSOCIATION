class MiPhoneTester
{
public static void main(String[] saturday)
{
MiPhone phone=new MiPhone();
phone.setBrand("RealMe");
phone.setColor("black");
phone.setImei("*#06#");
phone.setPrice(22500f);
PhonePay pay=new PhonePay();
phone.setPhonePay(pay);
pay.setCompany("flipkart");
//System.out.println(phone.phonePay.company);
pay.setVersion("13.4v");
pay.setArchitect("Sameer Nigam");
pay.setWorking(true);

}
}