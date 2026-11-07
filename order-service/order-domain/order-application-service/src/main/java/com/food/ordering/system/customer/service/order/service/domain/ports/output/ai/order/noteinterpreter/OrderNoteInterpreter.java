package com.food.ordering.system.customer.service.order.service.domain.ports.output.ai.order.noteinterpreter;

import com.food.ordering.system.customer.service.order.service.domain.valueobject.OrderPreferences;

public interface OrderNoteInterpreter {

    OrderPreferences interpret(String orderNotes);
}