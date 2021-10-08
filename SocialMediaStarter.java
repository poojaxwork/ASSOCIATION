class SocialMediaStarter
{
static public void main(String... pooja)
{
SocialMedia media=new SocialMedia();
media.setName("facebook");
//System.out.println(media.name);
media.setSize(40.5f);
media.setLang("English");
media.setPlatform("public");
media.setVersion(12.99f);
media.company=new Company();
Company comp=media.company;
media.setCompany(comp);
//System.out.println(media.company.name);
comp.setName("Facebook");
comp.setFounder("Markzuckerberg");
comp.setEst(2000);
comp.setNoOfEmployees(390354l);
comp.setHeadQuarter("Delhi");
comp.setRevenue(666.99f);
}

}