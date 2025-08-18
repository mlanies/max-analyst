package ru.ok.messages.video.fetcher.youtube.js;

import android.os.Handler;
import android.webkit.JavascriptInterface;
import androidx.annotation.Keep;
import defpackage.die;
import defpackage.h76;
import defpackage.v9g;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class JavaScriptInterface {
    public final die a;

    public JavaScriptInterface(die dieVar) {
        this.a = dieVar;
    }

    @JavascriptInterface
    @Keep
    public void returnResultToJava(String str) {
        die dieVar = this.a;
        v9g v9gVar = (v9g) ((AtomicReference) dieVar.c).getAndSet(null);
        if (v9gVar == null) {
            return;
        }
        ((Handler) dieVar.o).post(new h76(str, 9, v9gVar));
    }
}
