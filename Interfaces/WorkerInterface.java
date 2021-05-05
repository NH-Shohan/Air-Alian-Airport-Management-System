package Interfaces;

import Classes.Worker;

public interface WorkerInterface {

    boolean AddWorker(Worker W); // Abstract Method

    boolean RemoveWorker(Worker W);

    void ShowAllWorker();

    Worker searchWorker(int ID);
}
