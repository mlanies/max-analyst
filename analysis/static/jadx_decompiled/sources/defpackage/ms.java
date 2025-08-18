package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public final class ms extends y1 {
    public final transient int Y;

    public ms() {
        super(v93.a(12));
        wmd.i(3, "expectedValuesPerKey");
        this.Y = 3;
    }

    @Override // defpackage.y1
    public final Collection d() {
        return new ArrayList(this.Y);
    }
}
