package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.CamcorderProfile;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import javax.inject.Provider;
import org.apache.http.util.LangUtils;

/* loaded from: classes2.dex */
public final class c32 implements b66, kx3, qj3, ht1, vaf, pa5, xld, Provider {
    public final /* synthetic */ int a;
    public static final long[] b = new long[0];
    public static final c32 c = new c32(2, 0);
    public static final c32 o = new c32(3, 0);
    public static final /* synthetic */ c32 X = new c32(4, 0);
    public static final c32 Y = new c32(5, 0);
    public static final c32 Z = new c32(6, 0);

    public /* synthetic */ c32(int i, byte b2) {
        this.a = i;
    }

    public static c32 d(s77[] s77VarArr) {
        if (s77VarArr.length > 31) {
            throw new IllegalArgumentException(String.format("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", s77VarArr[0].getClass().getName(), Integer.valueOf(s77VarArr.length)));
        }
        int iB = 0;
        for (s77 s77Var : s77VarArr) {
            if (s77Var.a()) {
                iB |= s77Var.b();
            }
        }
        return new c32(iB);
    }

    @Override // defpackage.pa5
    /* renamed from: B */
    public yze mo6B(int i, int i2) {
        return new sk4();
    }

    @Override // defpackage.pa5
    public void J(v1d v1dVar) {
    }

    @Override // defpackage.ht1
    public CamcorderProfile a(int i, int i2) {
        return CamcorderProfile.get(i, i2);
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        hm9.p("v7g", "failure!", (Throwable) obj);
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) throws ImageCaptureException {
        ref refVarA = null;
        p55 p55Var = null;
        switch (this.a) {
            case 2:
                return (ztc) ((jle) ((hle) sd3.g.getValue())).c.getValue();
            case 3:
                np4 np4Var = (np4) obj;
                fp4 fp4Var = np4Var.a;
                ep4 ep4Var = new ep4(fp4Var.a, fp4Var.b);
                i20 i20Var = np4Var.e;
                if (i20Var != null) {
                    i20 i20Var2 = new i20(1);
                    i20Var2.a = i20Var.a;
                    i20Var2.c = i20Var.c;
                    i20Var2.b = i20Var.b;
                    i20Var2.d = i20Var.d;
                    refVarA = i20Var2.a();
                }
                return new lp4(ep4Var, np4Var.b, np4Var.c, np4Var.d, refVarA);
            default:
                jb0 jb0Var = (jb0) obj;
                ov6 ov6Var = jb0Var.b;
                x9b x9bVar = jb0Var.a;
                if (f46.V(ov6Var.k0())) {
                    try {
                        yu0 yu0Var = p55.b;
                        ByteBuffer byteBufferT = ov6Var.v()[0].t();
                        byteBufferT.rewind();
                        byte[] bArr = new byte[byteBufferT.capacity()];
                        byteBufferT.get(bArr);
                        p55Var = new p55(new c65(new ByteArrayInputStream(bArr)));
                        ov6Var.v()[0].t().rewind();
                    } catch (IOException e) {
                        throw new ImageCaptureException("Failed to extract EXIF data.", e);
                    }
                }
                p55 p55Var2 = p55Var;
                if (((ImageCaptureRotationOptionQuirk) wi4.a.e(ImageCaptureRotationOptionQuirk.class)) != null) {
                    aa0 aa0Var = kz1.i;
                } else if (f46.V(ov6Var.k0())) {
                    c54.o(p55Var2, "JPEG image must have exif.");
                    Size size = new Size(ov6Var.getWidth(), ov6Var.getHeight());
                    int iA = x9bVar.c - p55Var2.a();
                    Size size2 = e1f.c(e1f.i(iA)) ? new Size(size.getHeight(), size.getWidth()) : size;
                    Matrix matrixA = e1f.a(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, size2.getWidth(), size2.getHeight()), iA, false);
                    RectF rectF = new RectF(x9bVar.b);
                    matrixA.mapRect(rectF);
                    rectF.sort();
                    Rect rect = new Rect();
                    rectF.round(rect);
                    int iA2 = p55Var2.a();
                    Matrix matrix = new Matrix(x9bVar.e);
                    matrix.postConcat(matrixA);
                    pv1 sp3Var = ov6Var.getImageInfo() instanceof qv1 ? ((qv1) ov6Var.getImageInfo()).a : new sp3();
                    ov6Var.k0();
                    return new eb0(ov6Var, p55Var2, ov6Var.k0(), size2, rect, iA2, matrix, sp3Var);
                }
                Rect rect2 = x9bVar.b;
                pv1 sp3Var2 = ov6Var.getImageInfo() instanceof qv1 ? ((qv1) ov6Var.getImageInfo()).a : new sp3();
                int i = x9bVar.c;
                Matrix matrix2 = x9bVar.e;
                Size size3 = new Size(ov6Var.getWidth(), ov6Var.getHeight());
                if (f46.V(ov6Var.k0())) {
                    c54.o(p55Var2, "JPEG image must have Exif.");
                }
                return new eb0(ov6Var, p55Var2, ov6Var.k0(), size3, rect2, i, matrix2, sp3Var2);
        }
    }

    @Override // defpackage.xld
    public mn5 b(j0e j0eVar) {
        return new qn5(3, vld.a);
    }

    @Override // defpackage.ht1
    public boolean c(int i, int i2) {
        return CamcorderProfile.hasProfile(i, i2);
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new d9f(1);
    }

    @Override // defpackage.vaf
    public int j(Object obj) {
        return ((l43) obj).getSizeInBytes();
    }

    public String toString() {
        switch (this.a) {
            case LangUtils.HASH_SEED /* 17 */:
                return "SharingStarted.Eagerly";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.pa5
    public void w() {
    }

    public c32(int i) {
        this.a = 12;
    }
}
