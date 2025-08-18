package defpackage;

import ru.ok.messages.stickers.widgets.StickerView;

/* loaded from: classes2.dex */
public final /* synthetic */ class j4e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickerView b;

    public /* synthetic */ j4e(StickerView stickerView, int i) {
        this.a = i;
        this.b = stickerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        StickerView stickerView = this.b;
        switch (this.a) {
            case 0:
                stickerView.o.setClickable(true);
                return;
            case 1:
                if (!(!stickerView.s0)) {
                    throw null;
                }
                return;
            default:
                int i = StickerView.x0;
                stickerView.getClass();
                hm9.k("ru.ok.messages.stickers.widgets.StickerView", "startAnimation");
                stickerView.s0 = false;
                throw null;
        }
    }
}
