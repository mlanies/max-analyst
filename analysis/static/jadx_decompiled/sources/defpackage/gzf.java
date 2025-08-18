package defpackage;

import android.webkit.WebChromeClient;

/* loaded from: classes2.dex */
public final class gzf implements kzf {
    public final WebChromeClient.FileChooserParams a;

    public gzf(WebChromeClient.FileChooserParams fileChooserParams) {
        this.a = fileChooserParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gzf) && tpa.f(this.a, ((gzf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowFileChooser(params=" + this.a + ")";
    }
}
