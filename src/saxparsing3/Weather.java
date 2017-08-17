package saxparsing3;

/**
 * Created by danawacomputer on 2017-07-21.
 */
public class Weather {
    private String areaName;
    private String maxAvgTemp;
    private String minAvgTemp;
    private String avgTemp;
    private String avgHumid;

    public Weather() {
    }

    public Weather(String areaName, String maxAvgTemp, String minAvgTemp, String avgTemp, String avgHumid) {
        this.areaName = areaName;
        this.maxAvgTemp = maxAvgTemp;
        this.minAvgTemp = minAvgTemp;
        this.avgTemp = avgTemp;
        this.avgHumid = avgHumid;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getMaxAvgTemp() {
        return maxAvgTemp;
    }

    public void setMaxAvgTemp(String maxAvgTemp) {
        this.maxAvgTemp = maxAvgTemp;
    }

    public String getMinAvgTemp() {
        return minAvgTemp;
    }

    public void setMinAvgTemp(String minAvgTemp) {
        this.minAvgTemp = minAvgTemp;
    }

    public String getAvgTemp() {
        return avgTemp;
    }

    public void setAvgTemp(String avgTemp) {
        this.avgTemp = avgTemp;
    }

    public String getAvgHumid() {
        return avgHumid;
    }

    public void setAvgHumid(String avgHumid) {
        this.avgHumid = avgHumid;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "areaName='" + areaName + '\'' +
                ", maxAvgTemp='" + maxAvgTemp + '\'' +
                ", minAvgTemp='" + minAvgTemp + '\'' +
                ", avgTemp='" + avgTemp + '\'' +
                ", avgHumid='" + avgHumid + '\'' +
                '}';
    }
}
