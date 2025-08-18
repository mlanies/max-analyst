package defpackage;

import android.text.style.TypefaceSpan;

/* loaded from: classes2.dex */
public final class gc9 extends TypefaceSpan implements yz7 {
    public final int a;

    public gc9() {
        super("monospace");
        this.a = 5;
    }

    @Override // defpackage.uw3
    public final uw3 copy() {
        return new gc9();
    }

    @Override // defpackage.yz7
    public final int getType() {
        return this.a;
    }
}
