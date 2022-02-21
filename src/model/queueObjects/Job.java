package model.queueObjects;

import java.util.UUID;

public class Job {
    private UUID sender_uuid;
    private UUID empf_uuid;

    private StringBuilder msg_str = new StringBuilder();
    
    public Job(UUID sender_id, UUID empf_id, String msg){
        this.sender_uuid = sender_id;
        this.empf_uuid = empf_id;
        
        msg_str.append(msg);
    }


    // Getters & Setters

    public UUID getSender_uuid() {
        return sender_uuid;
    }

    public UUID getEmpf_uuid() {
        return empf_uuid;
    }

    public StringBuilder getMsg_str() {
        return msg_str;
    }

    public void setMsg_str(StringBuilder msg_str) {
        this.msg_str = msg_str;
    }

}
