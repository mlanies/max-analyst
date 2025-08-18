package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class kk5 implements zi5 {
    public final yx4 b = new yx4("ru.oneme.app.provider");
    public final Context c;

    public kk5(Context context) {
        this.c = context;
    }

    public static File g(String str, String str2) {
        File file = new File(str, str2);
        file.mkdirs();
        return file;
    }

    public static Uri r(String str) {
        if (oag.t(str)) {
            return null;
        }
        return Uri.parse(str);
    }

    public final String b() {
        File externalCacheDir;
        if (Build.VERSION.SDK_INT <= 29 || (externalCacheDir = this.c.getExternalCacheDir()) == null) {
            return c();
        }
        File file = new File(externalCacheDir.getAbsolutePath());
        if (!file.exists() && !file.mkdirs()) {
            hm9.m0("kk5", "getAppBasePath: mkdirs fails!", new Object[0]);
        }
        return file.getAbsolutePath();
    }

    public final String c() {
        File file = new File(this.c.getCacheDir().getAbsolutePath());
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public final File d(long j) {
        return new File(g(b(), "audioCache"), ey8.i(j, "audio_", ".wav"));
    }

    public final File e(long j) {
        return new File(g(b(), "botCommands"), ey8.h(j, "botCommands"));
    }

    public final Uri f(Context context, File file) {
        return FileProvider.d(context, file, this.b.a);
    }

    public final File h(l20 l20Var) {
        File file;
        boolean zT = oag.t(l20Var.s);
        long j = l20Var.w;
        s10 s10Var = l20Var.j;
        if (!zT) {
            File file2 = new File(l20Var.s);
            if (file2.exists() && file2.length() == s10Var.b && file2.lastModified() == j) {
                return file2;
            }
        }
        long j2 = s10Var.a;
        String strE = tfg.e(s10Var.c);
        String strE2 = tfg.e(strE);
        File fileJ = j();
        int iLastIndexOf = strE2.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            file = new File(fileJ, strE2.substring(0, iLastIndexOf) + "_" + j2 + strE2.substring(iLastIndexOf));
        } else {
            file = new File(fileJ, strE2 + "_" + j2);
        }
        if (file.exists()) {
            return file;
        }
        File file3 = new File(j(), strE);
        return (file3.exists() && file3.length() == s10Var.b && file3.lastModified() == j) ? file3 : pag.o(j(), tfg.e(strE));
    }

    public final File i(String str) {
        return new File(j(), tfg.e(str));
    }

    public final File j() {
        String str = Environment.DIRECTORY_DOWNLOADS;
        File externalFilesDir = Build.VERSION.SDK_INT == 29 ? this.c.getExternalFilesDir(str) : Environment.getExternalStoragePublicDirectory(str);
        if (externalFilesDir == null) {
            return null;
        }
        File file = new File(externalFilesDir.getAbsolutePath(), "MAX");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public final File k(long j) {
        return new File(g(b(), "gifCache"), ey8.h(j, "gif_"));
    }

    public final File l(String str) {
        return new File(m(), wg0.i("gif_preview", str));
    }

    public final File m() {
        return g(b(), "imageCache");
    }

    public final File n(String str) {
        return q(str + ".mp4");
    }

    public final File o(String str, String str2) {
        String strI = !oag.t(str2) ? wg0.i(".", str2) : "";
        if (str == null) {
            str = UUID.randomUUID().toString();
        }
        return q(str + strI);
    }

    public final File p() {
        File file = new File(b(), "showcase");
        if (file.exists() && file.isDirectory()) {
            file.delete();
        }
        return file;
    }

    public final File q(String str) {
        return new File(g(b(), "upload"), tfg.e(str));
    }

    public final File s(long j) {
        return new File(j(), ey8.i(j, "video_", ".mp4"));
    }
}
