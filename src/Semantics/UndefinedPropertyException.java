package src.Semantics;



    public class UndefinedPropertyException extends Exception {
        private final String propertyName;
        private final int lineNumber;

        public UndefinedPropertyException(String propertyName, int lineNumber) {
            super("Undefined property '" + propertyName + "' at line " + lineNumber);
            this.propertyName = propertyName;
            this.lineNumber = lineNumber;
        }

        public String getPropertyName() {
            return propertyName;
        }

        public int getLineNumber() {
            return lineNumber;
        }


    }
