import java.util.AbstractList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import Core.Flight;

public class PlaneData extends Flight{

    public String planeNo;
    public String planeName;
    public int capacity;           

public void setPlaneNo(String planeNo)
    {
        this.planeNo = planeNo;
    }

    public String getPlaneNo()
    {
        return this.planeNo;
    }

    public void setPlaneName(String planeName)
    {
        this.planeName = planeName;
    }

    public String getPlaneName()
    {
        return this.planeName;
    }

    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }

    public int getCapacity()
    {
        return this.capacity;
    }
}