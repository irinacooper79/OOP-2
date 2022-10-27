import java.time.LocalDat;
import oop.pert1.ValidationUtils;

public class Car {

    private final String brabd;

    private final String model;

    private float engineVolume;

    private String color;

    private final int manufacturingYear;

    private final String manufactureCountry;

    private String gearBox;

    private final String bodyType;

    private String regNumber;

    private final int placesCount;

    private boolean winterTires;

    private final Key;

    private final Insurance;
    public Car ( String brand, String model, float engineVolume, String color, int manufactureCountry,
                 String manufactureCountry,String gearBox, String bodyType, String regNumber, int placesCount,
                 boolean winterTires, Key,key, Insurance insurance){

        this.brand = ValidationUtils.validOrDefault( brand, "default");
        this.model = ValidationUtils.validOrDefault (model, "default");
        this.manufacturingYear = manufacturingYear >=0 ? manufacturingYear :
                this.manufactureCountry = ValidationUtils.validOrDefault(manufactureCountry
        this.bodyType = ValidationUtils.validOrDefault(bodyType,
                this.placesCount = Math.max(placesCount, 1);
        this.key = key;
        this.insurance = insurance;
        setEngineVolume(engineVolume);
        setColor(color);
        setGearBox(gearBox);
        setRegNumber(regNumber);
        setWinterTires(winterTires);
    }

    public void setSeasonTires(){
        int currentMonth = LocalDate.now().getMonthValue();
        this.winterTires = currentMonth <=4 || currentMonth >= 11;

        public boolean isRegNumberValid(){
            if (this.regNumber.length() != 9){
                retutn false;
            }

            char[] regNumberChars = this.regNumber.toCharArray();
            return isNumberLetter(regNumberChars[0])
                    && isNumber(regNumberChars[1])
                    && isNumber(regNumberChars[2])
                    && isNumber(regNumberChars[3])
                    && isNumberLetter(regNumberChars[4])
                    && isNumberLetter(regNumberChars[5])
                    && isNumber(regNumberChars[6])
                    && isNumber(regNumberChars[7])
                    && isNumber(regNumberChars[8]);
        }

        private boolean isNumber(char symbol) { return Character.isDigit(symbol


            private boolean isNumberLetter (char symbol){
                String allowedSymbols = "АВЕКМНОРСТУХ";
                return allowedSymbols.contains("" + symbol);
            }
            public String getBrand() {return brand;}

            public String getModel() {return model;}

            public float getEngineVolume() {return engineVolume;}

            public void setEngineVolume(float engineVolume){
                this.engineVolume = engineVolume > 0.0f ? engineVolume : 1.5f;
            }

            public String getColor() {return color; }

            public void setColor(String color){
                this.color = ValidatipnUtils.validOrDefault(color, "White");

                public int getManufacturingYear() { return manufacturingYear;) }

                public String getManufactureCountry() {return manufactureCountry;}

                public String getGearBox() {return gearBox; }

                public void setGearBox( String gearBox){
                    this.gearBox = ValidatipnUtils.validOrDefault (gearBox, "de

                    public String getBodyType() {return bodyType;}

                    public String getRegNumber() {return regNumber;}

                    public void setRegNumber (String regNumber ){
                        this.regNumber = ValidatipnUtils.validOrDefault(regNumber, "");

                        public int getPlacesCount() {return placesCount;}

                        public boolean isWinterTires() {return winterTires;}


                        public void setWinterTires(boolean winterTires ){ this.winterTires = winter;}

                        public String toString(){
                            return "Сar{" +
                                    "brand=" + brand + "/" +
                                    ", model=" + model + "/" +
                                    ", engineVolume=" + engineVolume +
                                    ", color=" + color + "/" +
                                    "manufacturingYear=" + ManufacturingYear + "/" +
                                    ", manufactureCountry=" + manufactureCountry + "/" +
                                    '}';
                        }

                        public static class Key {

                            private final boolean remoteEngineStart;

                            private final boolean keylessAccеss;

                            public Key(boolean remoteEngineStart, boolean keylessAccеss) {
                                this.remoteEngineStart = remoteEngineStart;
                                this.keylessAccеss = keylessAccеss;

                                public boolean isRemoteEngineStart() {return remoteEngineStart; }

                                public boolean isKeylessAccess() {return keylessAccess; }
                            }
                            public static class Insurance {

                                private final LocalDate validUntil;

                                private final float cost;

                                private final String number;


                                public Insurabce(LocalDate validUntil, float cost, String number) {
                                    this.validUntil = validUntil != null ? validUntil : LocalDate.now().plusDays( daysToAdd: 10);
                                    this.cost = Math.max(cost, 1f);
                                    this.number = ValidatipnUtils.validOrDefault(number, "default");
                                }

                                public boolean isNumberValid() {
                                    return number.length() == 9; }

                                public boolean isInsuranceValid() {
                                    return LocalDate.now().isBefore(this.validUntil);}
                            }
                        }
                    }
                }
            }
        }
    }
}