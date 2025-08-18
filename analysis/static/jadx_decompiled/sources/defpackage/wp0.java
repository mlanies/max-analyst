package defpackage;

import android.text.style.StyleSpan;

/* loaded from: classes2.dex */
public final class wp0 extends StyleSpan implements yz7 {
    public final /* synthetic */ int a;
    public final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp0(int i) {
        super(1);
        this.a = i;
        switch (i) {
            case 1:
                super(2);
                this.b = 3;
                break;
            default:
                this.b = 2;
                break;
        }
    }

    @Override // defpackage.uw3
    public final uw3 copy() {
        switch (this.a) {
            case 0:
                return new wp0(0);
            default:
                return new wp0(1);
        }
    }

    @Override // defpackage.yz7
    public final int getType() {
        switch (this.a) {
        }
        return this.b;
    }
}
