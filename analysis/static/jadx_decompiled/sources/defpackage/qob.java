package defpackage;

import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class qob implements ny9 {
    public static final Charset f = Charset.forName("UTF-8");
    public static final kf5 g = new kf5("key", au1.o(au1.n(pob.class, new jy(1))));
    public static final kf5 h = new kf5("value", au1.o(au1.n(pob.class, new jy(2))));
    public static final ma7 i = new ma7(1);
    public OutputStream a;
    public final Map b;
    public final Map c;
    public final my9 d;
    public final rob e = new rob(this);

    public qob(ByteArrayOutputStream byteArrayOutputStream, Map map, Map map2, my9 my9Var) {
        this.a = byteArrayOutputStream;
        this.b = map;
        this.c = map2;
        this.d = my9Var;
    }

    public static int g(kf5 kf5Var) {
        pob pobVar = (pob) ((Annotation) kf5Var.b.get(pob.class));
        if (pobVar != null) {
            return ((jy) pobVar).a;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // defpackage.ny9
    public final ny9 a(kf5 kf5Var, Object obj) {
        c(kf5Var, obj, true);
        return this;
    }

    public final void b(kf5 kf5Var, int i2, boolean z) {
        if (z && i2 == 0) {
            return;
        }
        pob pobVar = (pob) ((Annotation) kf5Var.b.get(pob.class));
        if (pobVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        h(((jy) pobVar).a << 3);
        h(i2);
    }

    public final void c(kf5 kf5Var, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            h((g(kf5Var) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            h(bytes.length);
            this.a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                c(kf5Var, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                f(i, kf5Var, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z && dDoubleValue == 0.0d) {
                return;
            }
            h((g(kf5Var) << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            h((g(kf5Var) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z && jLongValue == 0) {
                return;
            }
            pob pobVar = (pob) ((Annotation) kf5Var.b.get(pob.class));
            if (pobVar == null) {
                throw new EncodingException("Field has no @Protobuf config");
            }
            h(((jy) pobVar).a << 3);
            i(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            b(kf5Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            h((g(kf5Var) << 3) | 2);
            h(bArr.length);
            this.a.write(bArr);
            return;
        }
        my9 my9Var = (my9) this.b.get(obj.getClass());
        if (my9Var != null) {
            f(my9Var, kf5Var, obj, z);
            return;
        }
        waf wafVar = (waf) this.c.get(obj.getClass());
        if (wafVar != null) {
            rob robVar = this.e;
            robVar.a = false;
            robVar.c = kf5Var;
            robVar.b = z;
            wafVar.a(obj, robVar);
            return;
        }
        if (obj instanceof mob) {
            b(kf5Var, ((mob) obj).a(), true);
        } else if (obj instanceof Enum) {
            b(kf5Var, ((Enum) obj).ordinal(), true);
        } else {
            f(this.d, kf5Var, obj, z);
        }
    }

    @Override // defpackage.ny9
    public final ny9 d(kf5 kf5Var, int i2) {
        b(kf5Var, i2, true);
        return this;
    }

    @Override // defpackage.ny9
    public final ny9 e(kf5 kf5Var, long j) throws IOException {
        if (j != 0) {
            pob pobVar = (pob) ((Annotation) kf5Var.b.get(pob.class));
            if (pobVar == null) {
                throw new EncodingException("Field has no @Protobuf config");
            }
            h(((jy) pobVar).a << 3);
            i(j);
        }
        return this;
    }

    public final void f(my9 my9Var, kf5 kf5Var, Object obj, boolean z) throws IOException {
        rf7 rf7Var = new rf7();
        rf7Var.a = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = rf7Var;
            try {
                my9Var.a(obj, this);
                this.a = outputStream;
                long j = rf7Var.a;
                rf7Var.close();
                if (z && j == 0) {
                    return;
                }
                h((g(kf5Var) << 3) | 2);
                i(j);
                my9Var.a(obj, this);
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                rf7Var.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void h(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            this.a.write((i2 & 127) | 128);
            i2 >>>= 7;
        }
        this.a.write(i2 & 127);
    }

    public final void i(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.a.write(((int) j) & 127);
    }
}
