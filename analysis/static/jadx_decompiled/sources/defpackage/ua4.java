package defpackage;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.protocol.HTTP;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class ua4 implements qa5 {
    public static final int[] a = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};
    public static final qz7 b = new qz7(16);

    public static void c(ArrayList arrayList, int i) {
        Constructor constructor;
        ka5 ka5Var = null;
        switch (i) {
            case 0:
                arrayList.add(new q3());
                return;
            case 1:
                arrayList.add(new u3());
                return;
            case 2:
                arrayList.add(new dc());
                return;
            case 3:
                arrayList.add(new yc());
                return;
            case 4:
                qz7 qz7Var = b;
                synchronized (((AtomicBoolean) qz7Var.b)) {
                    if (((AtomicBoolean) qz7Var.b).get()) {
                        constructor = (Constructor) qz7Var.c;
                    } else {
                        try {
                            if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                                qz7Var.c = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(ka5.class).getConstructor(Integer.TYPE);
                            }
                        } catch (ClassNotFoundException unused) {
                        } catch (Exception e) {
                            throw new RuntimeException("Error instantiating FLAC extension", e);
                        }
                        ((AtomicBoolean) qz7Var.b).set(true);
                        constructor = (Constructor) qz7Var.c;
                    }
                }
                if (constructor != null) {
                    try {
                        ka5Var = (ka5) constructor.newInstance(0);
                    } catch (Exception e2) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e2);
                    }
                }
                if (ka5Var != null) {
                    arrayList.add(ka5Var);
                    return;
                } else {
                    arrayList.add(new lm5());
                    return;
                }
            case 5:
                arrayList.add(new ps5());
                return;
            case 6:
                arrayList.add(new c28(0));
                return;
            case 7:
                arrayList.add(new rd9());
                return;
            case 8:
                arrayList.add(new e26(0, null, Collections.emptyList(), null));
                arrayList.add(new vd9());
                return;
            case 9:
                arrayList.add(new j2a());
                return;
            case 10:
                arrayList.add(new rpb());
                return;
            case 11:
                arrayList.add(new h3f());
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                arrayList.add(new zrf());
                return;
            case 13:
            default:
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                arrayList.add(new p97());
                return;
        }
    }

    @Override // defpackage.qa5
    public final synchronized ka5[] a() {
        return b(Uri.EMPTY, new HashMap());
    }

    @Override // defpackage.qa5
    public final synchronized ka5[] b(Uri uri, Map map) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList(14);
            List list = (List) map.get(HTTP.CONTENT_TYPE);
            int iW = j1e.w((list == null || list.isEmpty()) ? null : (String) list.get(0));
            if (iW != -1) {
                c(arrayList, iW);
            }
            int iX = j1e.x(uri);
            if (iX != -1 && iX != iW) {
                c(arrayList, iX);
            }
            int[] iArr = a;
            for (int i = 0; i < 14; i++) {
                int i2 = iArr[i];
                if (i2 != iW && i2 != iX) {
                    c(arrayList, i2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (ka5[]) arrayList.toArray(new ka5[arrayList.size()]);
    }
}
