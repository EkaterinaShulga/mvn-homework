package sbp.school.jmx;

import org.springframework.beans.factory.annotation.Autowired;
import sbp.school.controllers.MyTargetController;

public class AppStatisticsImpl implements AppStatistics
{
    @Autowired
    private MyTargetController controller;

    @Override
    public int getTotalSingerCount()
    {
        System.out.println("Get Jmx statistics");
        return controller.testJmx();
    }
}
