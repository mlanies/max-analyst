package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class d24 {
    public static final d24 b;
    public final HashMap a;

    static {
        a14.O("Data");
        d24 d24Var = new d24(new HashMap());
        f(d24Var);
        b = d24Var;
    }

    public d24(d24 d24Var) {
        this.a = new HashMap(d24Var.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:29:0x0030
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static defpackage.d24 a(byte[] r5) {
        /*
            int r0 = r5.length
            r1 = 10240(0x2800, float:1.4349E-41)
            if (r0 > r1) goto L4c
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r5)
            r5 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L34 java.lang.Throwable -> L40
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L34 java.lang.Throwable -> L40
            int r5 = r2.readInt()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
        L19:
            if (r5 <= 0) goto L2d
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
            java.lang.Object r4 = r2.readObject()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
            int r5 = r5 + (-1)
            goto L19
        L29:
            r5 = move-exception
            goto L37
        L2b:
            r5 = r2
            goto L40
        L2d:
            r2.close()     // Catch: java.io.IOException -> L30
        L30:
            r1.close()     // Catch: java.io.IOException -> L46
            goto L46
        L34:
            r0 = move-exception
            r2 = r5
            r5 = r0
        L37:
            if (r2 == 0) goto L3c
            r2.close()     // Catch: java.io.IOException -> L3c
        L3c:
            r1.close()     // Catch: java.io.IOException -> L3f
        L3f:
            throw r5
        L40:
            if (r5 == 0) goto L30
            r5.close()     // Catch: java.io.IOException -> L30
            goto L30
        L46:
            d24 r5 = new d24
            r5.<init>(r0)
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d24.a(byte[]):d24");
    }

    public static byte[] f(d24 d24Var) {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException unused) {
        }
        try {
            objectOutputStream.writeInt(d24Var.a.size());
            for (Map.Entry entry : d24Var.a.entrySet()) {
                objectOutputStream.writeUTF((String) entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException unused2) {
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused3) {
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException unused4) {
            objectOutputStream2 = objectOutputStream;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException unused5) {
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused6) {
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException unused7) {
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException unused8) {
                throw th;
            }
        }
    }

    public final boolean b(String str, boolean z) {
        Object obj = this.a.get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z;
    }

    public final float c(String str) {
        Object obj = this.a.get(str);
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        return 0.0f;
    }

    public final long d(String str, long j) {
        Object obj = this.a.get(str);
        return obj instanceof Long ? ((Long) obj).longValue() : j;
    }

    public final String e(String str) {
        Object obj = this.a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d24.class != obj.getClass()) {
            return false;
        }
        HashMap map = this.a;
        Set<String> setKeySet = map.keySet();
        HashMap map2 = ((d24) obj).a;
        if (!setKeySet.equals(map2.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj2 = map.get(str);
            Object obj3 = map2.get(str);
            if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        HashMap map = this.a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = map.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public d24(Map map) {
        this.a = new HashMap(map);
    }
}
