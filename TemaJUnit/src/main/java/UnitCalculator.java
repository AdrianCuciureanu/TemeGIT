import java.util.ArrayList;
import java.util.List;

public class UnitCalculator {
    private String expresion;
    private Double result;

    public UnitCalculator(String expresion) {
        this.expresion = expresion;
    }

    public Double getResult() {
        return result;
    }

    public Double mmCalculator() {
        result = 0.0;
        List unitValues = new ArrayList<String>();
        String[] splitExpression = expresion.split("\\ ");
        for (int i = 0; i < splitExpression.length; i ++) {
            unitValues.add(splitExpression[i]);
        }
        for (int i = 0; i < unitValues.size(); i++) {
            if(unitValues.get(i) == "mm") {
                unitValues.remove(i);
            } else if (unitValues.get(i).equals("cm")) {
                unitValues.remove(i);
                unitValues.add(i, Double.toString( (Double.valueOf(String.valueOf(unitValues.get(i-1))) ) * 10));
                unitValues.remove(i - 1);
            } else if (unitValues.get(i).equals("dm")) {
                unitValues.remove(i);
                unitValues.add(i, Double.toString((Double.valueOf(String.valueOf(unitValues.get(i-1))) ) * 100));
                unitValues.remove(i - 1);
            } else if (unitValues.get(i).equals("m")) {
                unitValues.remove(i);
                unitValues.add(i, Double.toString((Double.valueOf(String.valueOf(unitValues.get(i-1))) ) * 1000));
                unitValues.remove(i - 1);
            } else if (unitValues.get(i).equals("km")) {
                unitValues.remove(i);
                unitValues.add(i, Double.toString((Double.valueOf(String.valueOf(unitValues.get(i-1))) ) * 1000000));
                unitValues.remove(i - 1);
            }
        }
        result = (Double.valueOf(String.valueOf(unitValues.get(0))) );
        for (int i = 0; i < unitValues.size(); i++) {
            if (unitValues.get(i).equals("+")) {
                result += (Double.valueOf(String.valueOf(unitValues.get(i+1))) );
            } else if (unitValues.get(i).equals("-")) {
                result -= (Double.valueOf(String.valueOf(unitValues.get(i+1))) );
            }
        }
        return result;
    }

    public Double cmCalculator() {
        result = 0.0;
        List unitValues = new ArrayList<String>();
        String[] splitExpression = expresion.split("\\ ");
        for (int i = 0; i < splitExpression.length; i ++) {
            unitValues.add(splitExpression[i]);
        }
        for (int i = 0; i < unitValues.size(); i++) {
            if(unitValues.get(i) == "cm") {
                unitValues.remove(i);
            } else if (unitValues.get(i).equals("mm")) {
                unitValues.remove(i);
                unitValues.add(i, Double.toString( (Double.valueOf(String.valueOf(unitValues.get(i-1))) ) * 0.1));
                unitValues.remove(i - 1);
            } else if (unitValues.get(i).equals("dm")) {
                unitValues.remove(i);
                unitValues.add(i, Double.toString((Double.valueOf(String.valueOf(unitValues.get(i-1))) ) * 10));
                unitValues.remove(i - 1);
            } else if (unitValues.get(i).equals("m")) {
                unitValues.remove(i);
                unitValues.add(i, Double.toString((Double.valueOf(String.valueOf(unitValues.get(i-1))) ) * 100));
                unitValues.remove(i - 1);
            } else if (unitValues.get(i).equals("km")) {
                unitValues.remove(i);
                unitValues.add(i, Double.toString((Double.valueOf(String.valueOf(unitValues.get(i-1))) ) * 100000));
                unitValues.remove(i - 1);
            }
        }
        result = (Double.valueOf(String.valueOf(unitValues.get(0))) );
        for (int i = 0; i < unitValues.size(); i++) {
            if (unitValues.get(i).equals("+")) {
                result += (Double.valueOf(String.valueOf(unitValues.get(i+1))) );
            } else if (unitValues.get(i).equals("-")) {
                result -= (Double.valueOf(String.valueOf(unitValues.get(i+1))) );
            }
        }
        return result;
    }

    public Double dmCalculator() {
        result = 0.0;
        List unitValues = new ArrayList<String>();
        String[] splitExpression = expresion.split("\\ ");
        for (int i = 0; i < splitExpression.length; i ++) {
            unitValues.add(splitExpression[i]);
        }
        for (int i = 0; i < unitValues.size(); i++) {
            if(unitValues.get(i) == "dm") {
                unitValues.remove(i);
            } else if (unitValues.get(i).equals("mm")) {
                unitValues.remove(i);
                unitValues.add(i, Double.toString( (Double.valueOf(String.valueOf(unitValues.get(i-1))) ) * 0.01));
                unitValues.remove(i - 1);
            } else if (unitValues.get(i).equals("cm")) {
                unitValues.remove(i);
                unitValues.add(i, Double.toString((Double.valueOf(String.valueOf(unitValues.get(i-1))) ) * 0.1));
                unitValues.remove(i - 1);
            } else if (unitValues.get(i).equals("m")) {
                unitValues.remove(i);
                unitValues.add(i, Double.toString((Double.valueOf(String.valueOf(unitValues.get(i-1))) ) * 10));
                unitValues.remove(i - 1);
            } else if (unitValues.get(i).equals("km")) {
                unitValues.remove(i);
                unitValues.add(i, Double.toString((Double.valueOf(String.valueOf(unitValues.get(i-1))) ) * 10000));
                unitValues.remove(i - 1);
            }
        }
        result = (Double.valueOf(String.valueOf(unitValues.get(0))) );
        for (int i = 0; i < unitValues.size(); i++) {
            if (unitValues.get(i).equals("+")) {
                result += (Double.valueOf(String.valueOf(unitValues.get(i+1))) );
            } else if (unitValues.get(i).equals("-")) {
                result -= (Double.valueOf(String.valueOf(unitValues.get(i+1))) );
            }
        }
        return result;
    }

    public Double mCalculator() {
        result = 0.0;
        List unitValues = new ArrayList<String>();
        String[] splitExpression = expresion.split("\\ ");
        for (int i = 0; i < splitExpression.length; i ++) {
            unitValues.add(splitExpression[i]);
        }
        for (int i = 0; i < unitValues.size(); i++) {
            if(unitValues.get(i) == "m") {
                unitValues.remove(i);
            } else if (unitValues.get(i).equals("mm")) {
                unitValues.remove(i);
                unitValues.add(i, Double.toString( (Double.valueOf(String.valueOf(unitValues.get(i-1))) ) * 0.001));
                unitValues.remove(i - 1);
            } else if (unitValues.get(i).equals("cm")) {
                unitValues.remove(i);
                unitValues.add(i, Double.toString((Double.valueOf(String.valueOf(unitValues.get(i-1))) ) * 0.01));
                unitValues.remove(i - 1);
            } else if (unitValues.get(i).equals("dm")) {
                unitValues.remove(i);
                unitValues.add(i, Double.toString((Double.valueOf(String.valueOf(unitValues.get(i-1))) ) * 0.1));
                unitValues.remove(i - 1);
            } else if (unitValues.get(i).equals("km")) {
                unitValues.remove(i);
                unitValues.add(i, Double.toString((Double.valueOf(String.valueOf(unitValues.get(i-1))) ) * 1000));
                unitValues.remove(i - 1);
            }
        }
        result = (Double.valueOf(String.valueOf(unitValues.get(0))) );
        for (int i = 0; i < unitValues.size(); i++) {
            if (unitValues.get(i).equals("+")) {
                result += (Double.valueOf(String.valueOf(unitValues.get(i+1))) );
            } else if (unitValues.get(i).equals("-")) {
                result -= (Double.valueOf(String.valueOf(unitValues.get(i+1))) );
            }
        }
        return result;
    }

    public Double kmCalculator() {
        result = 0.0;
        List unitValues = new ArrayList<String>();
        String[] splitExpression = expresion.split("\\ ");
        for (int i = 0; i < splitExpression.length; i ++) {
            unitValues.add(splitExpression[i]);
        }
        for (int i = 0; i < unitValues.size(); i++) {
            if(unitValues.get(i) == "km") {
                unitValues.remove(i);
            } else if (unitValues.get(i).equals("mm")) {
                unitValues.remove(i);
                unitValues.add(i, Double.toString( (Double.valueOf(String.valueOf(unitValues.get(i-1))) ) * 0.000001));
                unitValues.remove(i - 1);
            } else if (unitValues.get(i).equals("cm")) {
                unitValues.remove(i);
                unitValues.add(i, Double.toString((Double.valueOf(String.valueOf(unitValues.get(i-1))) ) * 0.00001));
                unitValues.remove(i - 1);
            } else if (unitValues.get(i).equals("dm")) {
                unitValues.remove(i);
                unitValues.add(i, Double.toString((Double.valueOf(String.valueOf(unitValues.get(i-1))) ) * 0.0001));
                unitValues.remove(i - 1);
            } else if (unitValues.get(i).equals("m")) {
                unitValues.remove(i);
                unitValues.add(i, Double.toString((Double.valueOf(String.valueOf(unitValues.get(i-1))) ) * 0.001));
                unitValues.remove(i - 1);
            }
        }
        result = (Double.valueOf(String.valueOf(unitValues.get(0))) );
        for (int i = 0; i < unitValues.size(); i++) {
            if (unitValues.get(i).equals("+")) {
                result += (Double.valueOf(String.valueOf(unitValues.get(i+1))) );
            } else if (unitValues.get(i).equals("-")) {
                result -= (Double.valueOf(String.valueOf(unitValues.get(i+1))) );
            }
        }
        return result;
    }
}
