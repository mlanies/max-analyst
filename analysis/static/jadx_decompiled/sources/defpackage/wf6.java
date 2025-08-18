package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class wf6 extends ote {
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wf6(int i) {
        super(10);
        this.o = i;
    }

    @Override // defpackage.ote
    public final int l(View view, int i, int i2) {
        switch (this.o) {
            case 0:
                return Integer.MIN_VALUE;
            case 1:
                return 0;
            case 2:
                return i;
            case 3:
                return i >> 1;
            case 4:
                if (view.getVisibility() == 8) {
                    return 0;
                }
                int baseline = view.getBaseline();
                if (baseline == -1) {
                    return Integer.MIN_VALUE;
                }
                return baseline;
            default:
                return Integer.MIN_VALUE;
        }
    }

    @Override // defpackage.ote
    public cg6 o() {
        switch (this.o) {
            case 4:
                return new yf6();
            default:
                return super.o();
        }
    }

    @Override // defpackage.ote
    public final String p() {
        switch (this.o) {
            case 0:
                return "UNDEFINED";
            case 1:
                return "LEADING";
            case 2:
                return "TRAILING";
            case 3:
                return "CENTER";
            case 4:
                return "BASELINE";
            default:
                return "FILL";
        }
    }

    @Override // defpackage.ote
    public final int r(View view, int i) {
        switch (this.o) {
            case 0:
                return Integer.MIN_VALUE;
            case 1:
                return 0;
            case 2:
                return i;
            case 3:
                return i >> 1;
            case 4:
                return 0;
            default:
                return 0;
        }
    }

    @Override // defpackage.ote
    public int v(int i, int i2) {
        switch (this.o) {
            case 5:
                return i2;
            default:
                return i;
        }
    }
}
