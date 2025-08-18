package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.util.AttributeSet;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public class hla extends WebView {
    public ValueCallback a;

    public hla(Context context, AttributeSet attributeSet, int i, int i2) {
        super(new du3(context, 0), (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
        b();
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public final void b() {
        int i;
        int iOrdinal = qp4.u0.b(getContext()).i().h().ordinal();
        if (iOrdinal == 0) {
            i = zoc.b;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = zoc.b;
        } else {
            i = zoc.a;
        }
        getContext().setTheme(i);
    }

    public final ValueCallback<Uri[]> getFilePathCallback() {
        return this.a;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        b();
        super.onConfigurationChanged(configuration);
    }

    public final void setFilePathCallback(ValueCallback<Uri[]> valueCallback) {
        this.a = valueCallback;
    }
}
