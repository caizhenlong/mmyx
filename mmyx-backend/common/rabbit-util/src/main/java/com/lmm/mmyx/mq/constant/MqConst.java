package  com.lmm.mmyx.mq.constant;

public class MqConst {
    /**
     * 消息补偿
     */
    public static final String MQ_KEY_PREFIX = "mmyx.mq:list";
    public static final int RETRY_COUNT = 3;

    /**
     * 商品上下架
     */
    public static final String EXCHANGE_GOODS_DIRECT = "mmyx.goods.direct";
    public static final String ROUTING_GOODS_UPPER = "mmyx.goods.upper";
    public static final String ROUTING_GOODS_LOWER = "mmyx.goods.lower";
    //队列
    public static final String QUEUE_GOODS_UPPER  = "mmyx.goods.upper";
    public static final String QUEUE_GOODS_LOWER  = "mmyx.goods.lower";

    /**
     * 团长上下线
     */
    public static final String EXCHANGE_LEADER_DIRECT = "mmyx.leader.direct";
    public static final String ROUTING_LEADER_UPPER = "mmyx.leader.upper";
    public static final String ROUTING_LEADER_LOWER = "mmyx.leader.lower";
    //队列
    public static final String QUEUE_LEADER_UPPER  = "mmyx.leader.upper";
    public static final String QUEUE_LEADER_LOWER  = "mmyx.leader.lower";

    //订单
    public static final String EXCHANGE_ORDER_DIRECT = "mmyx.order.direct";
    public static final String ROUTING_ROLLBACK_STOCK = "mmyx.rollback.stock";
    public static final String ROUTING_MINUS_STOCK = "mmyx.minus.stock";

    public static final String ROUTING_DELETE_CART = "mmyx.delete.cart";
    //解锁普通商品库存
    public static final String QUEUE_ROLLBACK_STOCK = "mmyx.rollback.stock";
    public static final String QUEUE_SECKILL_ROLLBACK_STOCK = "mmyx.seckill.rollback.stock";
    public static final String QUEUE_MINUS_STOCK = "mmyx.minus.stock";
    public static final String QUEUE_DELETE_CART = "mmyx.delete.cart";

    //支付
    public static final String EXCHANGE_PAY_DIRECT = "mmyx.pay.direct";
    public static final String ROUTING_PAY_SUCCESS = "mmyx.pay.success";
    public static final String QUEUE_ORDER_PAY  = "mmyx.order.pay";
    public static final String QUEUE_LEADER_BILL  = "mmyx.leader.bill";

    //取消订单
    public static final String EXCHANGE_CANCEL_ORDER_DIRECT = "mmyx.cancel.order.direct";
    public static final String ROUTING_CANCEL_ORDER = "mmyx.cancel.order";
    //延迟取消订单队列
    public static final String QUEUE_CANCEL_ORDER  = "mmyx.cancel.order";

    /**
     * 定时任务
     */
    public static final String EXCHANGE_DIRECT_TASK = "mmyx.exchange.direct.task";
    public static final String ROUTING_TASK_23 = "mmyx.task.23";
    //队列
    public static final String QUEUE_TASK_23  = "mmyx.queue.task.23";
}