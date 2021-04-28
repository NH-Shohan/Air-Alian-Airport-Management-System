package Interfaces;

import Classes.Worker;

public interface WorkerInterface {

    boolean AddWorker(Worker W);

    boolean RemoveWorker(Worker W);

    void ShowAllWorker();

    Worker searchWorker(int ID);
}
