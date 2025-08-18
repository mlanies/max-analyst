package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class fu4 {
    public static final HashMap a;
    public static final HashMap b;

    static {
        eu4 eu4Var;
        HashMap map = new HashMap();
        a = map;
        HashMap map2 = new HashMap();
        b = map2;
        eu4 eu4Var2 = eu4.d;
        map.put(1L, eu4Var2);
        map2.put(eu4Var2, Collections.singletonList(1L));
        map.put(2L, eu4.e);
        map2.put((eu4) map.get(2L), Collections.singletonList(2L));
        eu4 eu4Var3 = eu4.f;
        map.put(4L, eu4Var3);
        map2.put(eu4Var3, Collections.singletonList(4L));
        eu4 eu4Var4 = eu4.g;
        map.put(8L, eu4Var4);
        map2.put(eu4Var4, Collections.singletonList(8L));
        List listAsList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = listAsList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            eu4Var = eu4.h;
            if (!zHasNext) {
                break;
            }
            a.put((Long) it.next(), eu4Var);
        }
        b.put(eu4Var, listAsList);
        List listAsList2 = Arrays.asList(Long.valueOf(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID), Long.valueOf(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH), 256L, 512L);
        Iterator it2 = listAsList2.iterator();
        while (true) {
            boolean zHasNext2 = it2.hasNext();
            eu4 eu4Var5 = eu4.i;
            if (!zHasNext2) {
                b.put(eu4Var5, listAsList2);
                return;
            } else {
                a.put((Long) it2.next(), eu4Var5);
            }
        }
    }

    public static Long a(eu4 eu4Var, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = (List) b.get(eu4Var);
        if (list == null) {
            return null;
        }
        Set supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l : list) {
            if (supportedProfiles.contains(l)) {
                return l;
            }
        }
        return null;
    }
}
