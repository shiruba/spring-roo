package __TOP_LEVEL_PACKAGE__.__SEGMENT_PACKAGE__;

import com.google.gwt.requestfactory.shared.EntityProxy;
import __TOP_LEVEL_PACKAGE__.client.scaffold.place.ProxyListPlace;
import __TOP_LEVEL_PACKAGE__.client.request.ApplicationEntityTypesProcessor;

import java.util.HashSet;
import java.util.Set;

public class ScaffoldApp {

    static boolean isMobile = false;

    public static boolean isMobile() {
      return isMobile; 
    }

    public void run() {}

    protected HashSet<ProxyListPlace> getTopPlaces() {
        Set<Class<? extends EntityProxy>> types = ApplicationEntityTypesProcessor.getAll();
        HashSet<ProxyListPlace> rtn = new HashSet<ProxyListPlace>(types.size());

        for (Class<? extends EntityProxy> type : types) {
            rtn.add(new ProxyListPlace(type));
        }

        return rtn;
    }
}