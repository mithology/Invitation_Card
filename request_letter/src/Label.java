public class Label {
    public static void main(String[] args) throws Exception {
            String nameFormat = args[0];
            int legalAge = Integer.parseInt(args[1]);
            String countryName = args[2];
            String fileName = args[3];

            DataReader reader = new DataReader();
            String[] records = reader.read(fileName);

            MemberList list = new MemberList();
            list.addAll(records);

            String[] guests = list.getFrom(nameFormat, legalAge, countryName);
            for (String guest : guests) {
                System.out.println(guest);
            }

        }
}
