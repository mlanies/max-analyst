package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class b94 implements dt3 {
    public static final b94 c = new b94(Collections.emptyMap());
    public int a;
    public final Map b;

    public b94(Map map) {
        this.b = Collections.unmodifiableMap(map);
    }

    public static boolean c(Map map, Map map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final b94 b(imc imcVar) {
        byte[] bytes;
        Map map = this.b;
        HashMap map2 = new HashMap(map);
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList((ArrayList) imcVar.c));
        for (int i = 0; i < listUnmodifiableList.size(); i++) {
            map2.remove(listUnmodifiableList.get(i));
        }
        HashMap map3 = new HashMap((HashMap) imcVar.b);
        for (Map.Entry entry : map3.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        for (Map.Entry entry2 : Collections.unmodifiableMap(map3).entrySet()) {
            String str = (String) entry2.getKey();
            Object value2 = entry2.getValue();
            if (value2 instanceof Long) {
                bytes = ByteBuffer.allocate(8).putLong(((Long) value2).longValue()).array();
            } else if (value2 instanceof String) {
                bytes = ((String) value2).getBytes(b52.c);
            } else {
                if (!(value2 instanceof byte[])) {
                    throw new IllegalArgumentException();
                }
                bytes = (byte[]) value2;
            }
            map2.put(str, bytes);
        }
        return c(map, map2) ? this : new b94(map2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b94.class != obj.getClass()) {
            return false;
        }
        return c(this.b, ((b94) obj).b);
    }

    public final int hashCode() {
        if (this.a == 0) {
            int iHashCode = 0;
            for (Map.Entry entry : this.b.entrySet()) {
                iHashCode += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
            }
            this.a = iHashCode;
        }
        return this.a;
    }
}
