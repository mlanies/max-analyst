package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.internal.ContextScope;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.photoeditor.ActPhotoEditor;
import ru.ok.messages.settings.FrgMediaSettings;

/* loaded from: classes2.dex */
public final /* synthetic */ class v5 implements sj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sj3
    public final void accept(Object obj) {
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                jtc jtcVar = (jtc) obj;
                int i = ActLocalMedias.s1;
                ActLocalMedias actLocalMedias = (ActLocalMedias) obj2;
                actLocalMedias.getClass();
                actLocalMedias.q0(new ng4(jtcVar.a.b(), jtcVar.b));
                break;
            case 1:
                jtc jtcVar2 = (jtc) obj;
                int i2 = ActPhotoEditor.Z0;
                ActPhotoEditor actPhotoEditor = (ActPhotoEditor) obj2;
                actPhotoEditor.getClass();
                actPhotoEditor.k0(new ng4(jtcVar2.a.b(), jtcVar2.b));
                break;
            case 2:
                Collection collection = (Collection) obj;
                ix ixVar = (ix) obj2;
                hm9.n(ixVar.b, zr6.h(collection.size(), "ValidateMessagesTimeUseCase find some items for delete, count = "));
                j47.T((ContextScope) ixVar.g, null, null, new hx(ixVar, collection, null), 3);
                break;
            case 3:
                xdf xdfVar = (xdf) obj;
                FrgMediaSettings frgMediaSettings = (FrgMediaSettings) obj2;
                jp jpVar = frgMediaSettings.E1;
                jpVar.getClass();
                jpVar.m("app.media.video.compress", xdfVar.name());
                frgMediaSettings.G1.d(xdfVar.ordinal(), "VIDEO_COMPRESSION_MODE_SELECTED");
                frgMediaSettings.v1();
                break;
            case 4:
                ((View) obj2).getWindowVisibleDisplayFrame((Rect) obj);
                break;
            default:
                ((ArrayList) obj2).addAll((List) obj);
                break;
        }
    }
}
