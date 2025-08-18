package defpackage;

import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes.dex */
public class ko extends u2 {
    public final /* synthetic */ AppCompatTextView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko(AppCompatTextView appCompatTextView) {
        super(1, appCompatTextView);
        this.c = appCompatTextView;
    }

    @Override // defpackage.jo
    public final void C1(int i) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i);
    }

    @Override // defpackage.jo
    public final void q1(int i) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i);
    }
}
