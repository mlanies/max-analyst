package defpackage;

import com.facebook.imagepipeline.nativecode.NativeJpegTranscoderFactory;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class uf9 implements zv6 {
    public final int a;

    public uf9(int i) {
        this.a = i;
    }

    public final yv6 a(ou6 ou6Var, boolean z) {
        int i = this.a;
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            return ((zv6) NativeJpegTranscoderFactory.class.getConstructor(cls, cls2, cls2).newInstance(Integer.valueOf(i), Boolean.FALSE, Boolean.TRUE)).createImageTranscoder(ou6Var, z);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e2);
        } catch (IllegalArgumentException e3) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e4);
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e5);
        } catch (SecurityException e6) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e6);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e7);
        }
    }

    @Override // defpackage.zv6
    public final yv6 createImageTranscoder(ou6 ou6Var, boolean z) {
        yv6 yv6VarA = nu0.D0 ? a(ou6Var, z) : null;
        return yv6VarA == null ? new md3(z, this.a) : yv6VarA;
    }
}
