package com.nybsys.tillboxweb.appenum;

public class TillBoxAppEnum {
    public enum BrokerRequestType {
        API_CONTROLLER(0),
        WORKER(1);

        private int requestFrom;

        BrokerRequestType(int requestFrom){
            this.requestFrom = requestFrom;
        }

        public int get(){
            return this.requestFrom;
        }
    }

}
