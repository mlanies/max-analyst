package defpackage;

import android.content.ComponentName;
import android.support.v4.app.INotificationSideChannel;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class nv9 {
    public final ComponentName a;
    public INotificationSideChannel c;
    public boolean b = false;
    public final ArrayDeque d = new ArrayDeque();
    public int e = 0;

    public nv9(ComponentName componentName) {
        this.a = componentName;
    }
}
