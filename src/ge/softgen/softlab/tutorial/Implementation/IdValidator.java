package ge.softgen.softlab.tutorial.Implementation;

import ge.softgen.softlab.tutorial.Interface.Validator;

public class IdValidator implements Validator {
    String id;

    public IdValidator(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Boolean isValid() {
        if(id.length()!=11){
            return false;
        }
        for(int i=0; i<id.length(); ++i){
            if(!(id.charAt(i)>='0' && id.charAt(i)<='9')){
                return false;
            }
        }
        return true;
    }
}
