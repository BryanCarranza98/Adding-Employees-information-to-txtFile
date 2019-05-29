public abstract class Employee
{

        protected String firstName;
        protected String lastName;
        protected double wage;
        public double hoursWorked;

        protected double weeklyPay;



        public Employee()
        {


        }


        public Employee(String firstName, String lastName, double wage, double hoursWorked ) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.wage = wage;
                this.hoursWorked = hoursWorked;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public void setLastName( String lastName) { this.lastName = lastName; }

        public void setwage(double wage) {
                this.wage = wage;
        }

        public void sethoursWorked(double hoursWorked) {
                this.hoursWorked = hoursWorked;
        }





        public String getFirstName() {
                return firstName;
        }

        public String getLastName() { return  lastName; }

        public double getwage() {
                return wage;
        }

        public double gethoursWorked() {

                return hoursWorked;
        }



        @Override
        public String toString() {
                return "Employee{" +
                        "name='" + firstName + '\'' +
                        ", lastName='" + lastName + '\''+
                        ", wage=" + wage +
                        ", hoursWorked=" + hoursWorked +


                        '}';
        }


        public double getWeeklyPay()
        {

                return gethoursWorked();
        }



}
