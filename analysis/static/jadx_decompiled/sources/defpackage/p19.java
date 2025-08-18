package defpackage;

import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class p19 extends v2 {
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p19(ilc ilcVar, int i) {
        super(ilcVar);
        this.o = i;
    }

    @Override // defpackage.v2
    public final String g() {
        switch (this.o) {
            case 0:
                return "UPDATE messages SET status = ? WHERE chat_id = ? AND time >= ? AND time <= ?";
            case 1:
                return "UPDATE messages SET channel_views = ? AND channel_forwards = ? WHERE server_id = ?";
            case 2:
                return "UPDATE messages SET reactions = ? WHERE server_id = ?";
            case 3:
                return "UPDATE messages SET delayed_attrs_time_to_fire = ? AND delayed_attrs_notify_sender = ? WHERE id = ?";
            case 4:
                return "DELETE FROM messages WHERE chat_id = ?";
            case 5:
                return "DELETE FROM messages";
            case 6:
                return "DELETE FROM messages WHERE chat_id = ? AND time <= ? AND inserted_from_msg_link = 0 AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL";
            case 7:
                return "DELETE FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire <= ? AND inserted_from_msg_link = 0 AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL";
            case 8:
                return "DELETE FROM messages WHERE chat_id = ? AND server_id = 0 AND time_local >= ? AND time_local <= ?";
            case 9:
                return "DELETE FROM messages WHERE media_type = ?";
            case 10:
                return "UPDATE messages SET chat_id = ? WHERE id = ?";
            case 11:
                return "UPDATE messages SET delivery_status = ? WHERE id = ?";
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return "DELETE FROM fcm_notifications WHERE time <= ?";
            case 13:
                return "DELETE FROM fcm_notifications WHERE time <= ? AND chat_id = ?";
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return "DELETE FROM fcm_notifications";
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return "DELETE FROM fcm_notifications WHERE chat_id = ?";
            case 16:
                return "DELETE FROM notifications_read_marks";
            case LangUtils.HASH_SEED /* 17 */:
                return "DELETE FROM notifications_tracker_messages WHERE time<=?";
            case 18:
                return "DELETE FROM notifications_tracker_messages";
            case 19:
                return "UPDATE phones SET server_phone = ?, type = ? WHERE phone = ?";
            case 20:
                return "DELETE FROM phones";
            case 21:
                return "DELETE FROM phones WHERE id = ?";
            case 22:
                return "DELETE FROM profile";
            case 23:
                return "DELETE FROM reactions_section";
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return "DELETE FROM recent";
            case 25:
                return "DELETE FROM folder_and_chats WHERE folderId = ? AND chatId = ?";
            case 26:
                return "UPDATE chat_folder SET title = ?, emoji = ? WHERE id = ?";
            case 27:
                return "UPDATE chat_folder SET hideIfEmpty = ? WHERE id = ?";
            case 28:
                return "DELETE FROM folder_and_chats WHERE chatId = ?";
            default:
                return "UPDATE chat_folder SET isRemoved = 1 WHERE id=?";
        }
    }
}
