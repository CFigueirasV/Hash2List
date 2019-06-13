
package hash2list;

import java.util.ArrayList;

public class Hash2List extends ClassList {

    public Hash2List(ClassHash mapHash) {


        lista = new ArrayList<String>(mapHash.map.values());

    }

}