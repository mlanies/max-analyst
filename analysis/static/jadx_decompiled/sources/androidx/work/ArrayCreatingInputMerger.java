package androidx.work;

import defpackage.d24;
import defpackage.n17;
import defpackage.qqd;
import defpackage.tpa;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/ArrayCreatingInputMerger;", "Ln17;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends n17 {
    @Override // defpackage.n17
    public final d24 a(ArrayList arrayList) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        Object objNewInstance;
        qqd qqdVar = new qqd(9, (byte) 0);
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : Collections.unmodifiableMap(((d24) it.next()).a).entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                Class cls = value != null ? value.getClass() : String.class;
                Object obj = map.get(str);
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (cls2.equals(cls)) {
                        int length = Array.getLength(obj);
                        int length2 = Array.getLength(value);
                        Object objNewInstance2 = Array.newInstance(obj.getClass().getComponentType(), length + length2);
                        System.arraycopy(obj, 0, objNewInstance2, 0, length);
                        System.arraycopy(value, 0, objNewInstance2, length, length2);
                        value = objNewInstance2;
                    } else {
                        if (!tpa.f(cls2.getComponentType(), cls)) {
                            throw new IllegalArgumentException();
                        }
                        int length3 = Array.getLength(obj);
                        objNewInstance = Array.newInstance(cls, length3 + 1);
                        System.arraycopy(obj, 0, objNewInstance, 0, length3);
                        Array.set(objNewInstance, length3, value);
                        value = objNewInstance;
                    }
                } else if (!cls.isArray()) {
                    objNewInstance = Array.newInstance(cls, 1);
                    Array.set(objNewInstance, 0, value);
                    value = objNewInstance;
                }
                map.put(str, value);
            }
        }
        qqdVar.B(map);
        return qqdVar.p();
    }
}
