package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;

/* loaded from: classes2.dex */
public final class dk6 extends ColorDrawable {
    public final /* synthetic */ jec a;
    public final /* synthetic */ Path b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk6(jec jecVar, Path path, int i) {
        super(i);
        this.a = jecVar;
        this.b = path;
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave = canvas.save();
        if (this.a.a) {
            canvas.clipOutPath(this.b);
        }
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }
}
