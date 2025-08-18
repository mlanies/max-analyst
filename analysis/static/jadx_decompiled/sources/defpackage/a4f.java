package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class a4f {
    public static final kj6 a = new kj6();
    public static final mw7 b = new mw7(16);

    public static Typeface a(Context context, vx5[] vx5VarArr, int i) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        a.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (vx5 vx5Var : vx5VarArr) {
                try {
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(vx5Var.a, "r", null);
                } catch (IOException unused) {
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                    }
                } else {
                    try {
                        Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(vx5Var.c).setSlant(vx5Var.d ? 1 : 0).setTtcIndex(vx5Var.b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(fontBuild);
                        } else {
                            builder.addFont(fontBuild);
                        }
                    } catch (Throwable th) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                parcelFileDescriptorOpenFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(kj6.k(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface b(android.content.Context r14, defpackage.rx5 r15, android.content.res.Resources r16, int r17, java.lang.String r18, int r19, int r20, defpackage.tu0 r21, boolean r22) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a4f.b(android.content.Context, rx5, android.content.res.Resources, int, java.lang.String, int, int, tu0, boolean):android.graphics.Typeface");
    }

    public static Typeface c(Resources resources, int i, String str, int i2, int i3) throws IOException {
        Typeface typefaceBuild;
        a.getClass();
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            typefaceBuild = new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            typefaceBuild = null;
        }
        if (typefaceBuild != null) {
            b.d(d(resources, i, str, i2, i3), typefaceBuild);
        }
        return typefaceBuild;
    }

    public static String d(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
