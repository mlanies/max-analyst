package androidx.work.impl.model;

import defpackage.q8g;
import defpackage.w8g;
import defpackage.x53;
import defpackage.z53;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\f\u001a\u00020\bH'¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000e\u0010\u0010J'\u0010\u0013\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\rH'¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\f\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0015\u0010\u000fJ\u001d\u0010\u0016\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\rH'¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0019\u0010\u0006J\u001d\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\rH\u0017¢\u0006\u0004\b\u001b\u0010\u001cø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, d2 = {"Landroidx/work/impl/model/WorkersQueueDao;", "", "Lq8g;", "item", "Le5f;", "insertOrIgnore", "(Lq8g;)V", "insertOrReplace", "", "state", NewHtcHomeBadger.COUNT, "(I)I", "limit", "", "select", "(I)Ljava/util/List;", "(II)Ljava/util/List;", "", "ids", "updateState", "(ILjava/util/List;)V", "getItemsForRunning", "delete", "(Ljava/util/List;)V", "workerQueueItem", "insert", "", "contains", "(Ljava/util/List;)Z", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public interface WorkersQueueDao {
    default boolean contains(List<String> ids) {
        List<q8g> listSelect = select(ids.size());
        ArrayList arrayList = new ArrayList(z53.S(listSelect, 10));
        Iterator<T> it = listSelect.iterator();
        while (it.hasNext()) {
            arrayList.add(((q8g) it.next()).a);
        }
        return x53.B0(arrayList).containsAll(x53.H0(ids));
    }

    int count(int state);

    void delete(List<String> ids);

    default List<q8g> getItemsForRunning(int limit) {
        List<q8g> listSelect = select(limit, 0);
        ArrayList arrayList = new ArrayList(z53.S(listSelect, 10));
        Iterator<T> it = listSelect.iterator();
        while (it.hasNext()) {
            arrayList.add(((q8g) it.next()).a);
        }
        updateState(1, arrayList);
        return listSelect;
    }

    default void insert(q8g workerQueueItem) {
        if (w8g.$EnumSwitchMapping$0[workerQueueItem.c.ordinal()] == 1) {
            insertOrIgnore(workerQueueItem);
        } else {
            insertOrReplace(workerQueueItem);
        }
    }

    void insertOrIgnore(q8g item);

    void insertOrReplace(q8g item);

    List<q8g> select(int limit);

    List<q8g> select(int limit, int state);

    void updateState(int state, List<String> ids);
}
