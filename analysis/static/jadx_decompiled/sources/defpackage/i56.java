package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class i56 extends LinkedHashMap {
    public final /* synthetic */ int a;
    public final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i56(int i, int i2, byte b) {
        super(i, 1.0f, false);
        this.a = i2;
        this.b = 4;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        switch (this.a) {
            case 0:
                if (size() > this.b) {
                }
                break;
            case 1:
                if (size() > this.b) {
                }
                break;
            default:
                if (super.size() > this.b) {
                }
                break;
        }
        return false;
    }

    public i56(int i) {
        this.a = 2;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i56(int i, int i2) {
        super(4, 0.75f, true);
        this.a = 2;
        this.b = i;
    }
}
