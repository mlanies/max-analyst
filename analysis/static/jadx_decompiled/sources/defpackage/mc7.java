package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.keyboardmedia.emoji.KeyboardEmojiWidget;

/* loaded from: classes2.dex */
public final class mc7 extends kg6 {
    public final /* synthetic */ int c = 1;
    public final Object d;
    public final Object e;

    public mc7(GridLayoutManager gridLayoutManager, hdc hdcVar) {
        this.d = gridLayoutManager;
        this.e = hdcVar;
    }

    @Override // defpackage.kg6
    public final int c(int i) {
        GridLayoutManager gridLayoutManagerQ;
        int iL;
        switch (this.c) {
            case 0:
                KeyboardEmojiWidget keyboardEmojiWidget = (KeyboardEmojiWidget) this.d;
                if (i >= keyboardEmojiWidget.X.j() || keyboardEmojiWidget.X.l(i) != jca.q || (gridLayoutManagerQ = z7.q((RecyclerView) this.e)) == null) {
                    return 1;
                }
                return gridLayoutManagerQ.F;
            default:
                hdc hdcVar = (hdc) this.e;
                if (i >= hdcVar.j() || !((iL = hdcVar.l(i)) == tga.k || iL == tga.l || iL == jca.r)) {
                    return 1;
                }
                return ((GridLayoutManager) this.d).F;
        }
    }

    public mc7(KeyboardEmojiWidget keyboardEmojiWidget, RecyclerView recyclerView) {
        this.d = keyboardEmojiWidget;
        this.e = recyclerView;
    }
}
