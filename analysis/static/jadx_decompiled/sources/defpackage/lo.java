package defpackage;

import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes.dex */
public final class lo extends ko {
    public final /* synthetic */ AppCompatTextView o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.o = appCompatTextView;
    }

    @Override // defpackage.u2, defpackage.jo
    public final void G1(int i, float f) {
        super/*android.widget.TextView*/.setLineHeight(i, f);
    }
}
