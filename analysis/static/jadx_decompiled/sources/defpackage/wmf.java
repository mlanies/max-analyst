package defpackage;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class wmf {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static bt3 b(View view, bt3 bt3Var) {
        ContentInfo contentInfoP = bt3Var.a.p();
        Objects.requireNonNull(contentInfoP);
        ContentInfo contentInfoM = m30.m(contentInfoP);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoM);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoM ? bt3Var : new bt3(new wd6(contentInfoPerformReceiveContent));
    }

    public static void c(View view, String[] strArr, v3a v3aVar) {
        if (v3aVar == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new xmf(v3aVar));
        }
    }
}
