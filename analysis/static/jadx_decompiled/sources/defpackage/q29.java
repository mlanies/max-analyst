package defpackage;

import java.util.Iterator;
import java.util.List;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public interface q29 {
    List b();

    default MessageModel d(long j) {
        Object next;
        Iterator it = b().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((MessageModel) next).a == j) {
                break;
            }
        }
        return (MessageModel) next;
    }

    default int f(long j) {
        List listB = b();
        int size = listB.size();
        int i = 0;
        y53.P(listB.size(), 0, size);
        int i2 = size - 1;
        while (i <= i2) {
            int i3 = (i + i2) >>> 1;
            int iIntValue = Integer.valueOf(tpa.n(((MessageModel) listB.get(i3)).c, j)).intValue();
            if (iIntValue < 0) {
                i = i3 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i3;
                }
                i2 = i3 - 1;
            }
        }
        return -(i + 1);
    }
}
