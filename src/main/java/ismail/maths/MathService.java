package ismail.maths;

import org.springframework.stereotype.Service;

@Service
public class MathService {
    public  Result doAddition(int no1,int no2 ){
    Result result= new Result(no1+ no2 , "Finished Addition");
    return result;
    }
}
